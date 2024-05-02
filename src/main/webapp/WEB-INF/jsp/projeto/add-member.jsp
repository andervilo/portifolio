<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="../common/header-start.jspf"%>
<link href="<c:url value="../../../static/projeto/create.css"/>" rel="stylesheet">
<%@ include file="../common/header-end.jspf"%>
<%@ include file="../common/navbar.jspf"%>
<div class="container cstmt-5">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading"><h3>Adicionar Membro ao Projeto ${projeto.nome}</h3></div>
                <div class="panel-body">
                    <form   method="post" modelAttribute="membro">
                        <input type="hidden" name="idProjeto" value="${projeto.id}">

                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="membro">Membro</label>
                                <select name="idPessoa" class="form-select" aria-label="Default select example">
                                    <option selected>Selecione um Funcionário</option>
                                    <c:forEach var="funcionario" items="${funcionarios}">
                                        <option value="${funcionario.id}">${funcionario.getNome()}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </fieldset>

                        <button type="submit"  class="btn btn-success" >Salvar</button>
                    </form>
                </div>
            </div>

            <div class="panel panel-primary mt-2">
                <div class="panel-heading">
                    <div class="d-flex d-flex justify-content-between">
                        <div>
                            <h3>Lista de Membros</h3>
                        </div>
                    </div>

                </div>

                <div class="panel-body">
                    <table class="table table-striped table-sm">
                        <thead>
                        <tr>
                            <th width="10%">#ID</th>
                            <th width="15%">Nome</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${membros}" var="membro">
                            <tr>
                                <td>${membro.id}</td>
                                <td>${membro.nome}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

</div>
<%@ include file="../common/footer.jspf"%>
