<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="../common/header-start.jspf"%>
<link href="<c:url value="../../../static/projeto/index.css"/>" rel="stylesheet">
<%@ include file="../common/header-end.jspf"%>
<%@ include file="../common/navbar.jspf"%>
<div class="container cstmt-5">


    <div class="panel panel-primary">
        <div class="panel-heading">
            <div class="d-flex d-flex justify-content-between">
                <div>
                    <h3>Lista de Projetos</h3>
                </div>
                <div>
                    <div>
                        <a type="button" class="btn btn-primary btn-md" href="/novo-projeto">Novo Projeto</a>
                    </div>
                </div>
            </div>

        </div>

        <div class="panel-body">
            <table class="table table-striped table-sm">
                <thead>
                <tr>
                    <th width="20%">Nome</th>
                    <th width="20%">Gerente</th>
                    <th width="15%">Status</th>
                    <th width="15%">Risco</th>
                    <th width="30%"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${projetos}" var="projeto">
                    <tr>
                        <td>${projeto.nome}</td>
                        <td>${projeto.gerente.nome}</td>
                        <td>${projeto.status.displayValue()}</td>
                        <td>${projeto.risco.displayValue()}</td>
                        <td><a type="button" class="btn btn-success" href="/atualizar-projeto/${projeto.id}">Atualizar</a>
                            <a id="$excluirBtn${projeto.id}{}" type="button" class="btn btn-warning" onclick="excluir(${projeto.id}, '${projeto.nome}')">Excluir</a>
                            <a type="button" class="btn btn-info" href="/visualizar-projeto/${projeto.id}">Visualizar</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>

<%@ include file="../common/footer.jspf"%>
<script>
    const excluir = (id, nome) => {
        console.log(id, nome)
        Swal.fire({
            title: 'Excluir Projeto!',
            text: 'Deseja excluir o Projeto: '+ id + ' - '+ nome+'?',
            icon: 'info',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Sim',
            cancelButtonText: 'Não'
        }).then(function(result) {
            if (result.isConfirmed) {

                fetch('/excluir-projeto/' + id, {
                    method: 'DELETE',
                    headers: {
                        'Content-Type': 'application/json'
                    }
                })
                    .then(response => {
                        console.log(response)
                        if (!response.ok) {
                            Swal.fire({
                                title: 'Erro!',
                                text: 'Erro ao excluir Projeto: '+ id + ' - '+ nome+'!',
                                icon: 'error',
                            })
                            return;
                        }

                        Swal.fire({
                            title: 'Sucesso!',
                            text: 'Projeto: '+ id + ' - '+ nome+' excluido com sucesso!',
                            icon: 'success',
                            showCancelButton: false,
                            confirmButtonColor: '#3085d6',
                            confirmButtonText: 'Ok',
                        }).then(function(result) {
                            if (result.isConfirmed) {
                                window.location.href = '/';
                            }
                        });

                    })
                    .catch(error => {
                        Swal.fire({
                            title: 'Erro!',
                            text: 'Erro ao excluir Projeto: '+ id + ' - '+ nome+'!',
                            icon: 'error',
                        })
                    });
            }
        })
    }


    let message = "${message}";

    if (message === "CREATE_SUCCESS") {
        Swal.fire({
            title: 'Sucesso!',
            text: 'Projeto inserido com sucesso!',
            icon: 'success'
        })
    }
    if(message === "UPDATE_SUCCESS") {
        Swal.fire({
            title: 'Sucesso!',
            text: 'Projeto atualizado com sucesso!',
            icon: 'success'
        })
    }

</script>

