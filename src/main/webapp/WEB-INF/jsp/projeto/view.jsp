<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="../common/header-start.jspf"%>
<link href="<c:url value="../../../static/projeto/create.css"/>" rel="stylesheet">
<%@ include file="../common/header-end.jspf"%>
<%@ include file="../common/navbar.jspf"%>

<div class="container cstmt-5">
    <div class="row">
        <div class="col-md-10 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading"><h3>Vizualizar Projeto</h3></div>
                <div class="panel-body">
                    <table class="table table-striped ">
                        <tbody>
                            <tr>
                                <td width="20%">#ID</td>
                                <td>${projeto.id}</td>
                            </tr>
                            <tr>
                                <td>Nome</td>
                                <td>${projeto.nome}</td>
                            </tr>
                            <tr>
                                <td>Data de Início</td>
                                <td id="datInicio"></td>
                            </tr>
                            <tr>
                                <td>Previsão Data de finalização</td>
                                <td id="dataPrevisaoFim"></td>
                            </tr>
                            <tr>
                                <td>Data de finalização</td>
                                <td id="dataFim"></td>
                            </tr>
                            <tr>
                                <td>Descrição</td>
                                <td>${projeto.descricao}</td>
                            </tr>
                            <tr>
                                <td>Orçamento</td>
                                <td>${projeto.orcamento}</td>
                            </tr>
                            <tr>
                                <td>Status</td>
                                <td>${projeto.status.displayValue()}</td>
                            </tr>
                            <tr>
                                <td>Risco</td>
                                <td>${projeto.risco.displayValue()}</td>
                            </tr>
                            <tr>
                                <td>Gerente</td>
                                <td>${projeto.gerente.getNome()}</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>

</div>
<%@ include file="../common/footer.jspf"%>

        <script>
            const formatarData = (data) => {
                let dataF = data.split("-").reverse().join("/")
                return dataF
                // let options = { year: 'numeric', month: '2-digit', day: '2-digit' };
                // return new Date(data).setUTCHours(0, 0, 0, 0).toLocaleString('pt-BR', options);
            }

            var dataInicio = "${projeto.dataInicio}";
            var dataFormatada = formatarData(dataInicio);
            console.log(dataFormatada)
            document.getElementById("datInicio").textContent = dataFormatada;

            dataFim = "${projeto.dataFim}";
            dataFormatada = formatarData(dataFim);
            console.log(dataFormatada)
            document.getElementById("dataFim").textContent = dataFormatada;

            dataPrevisaoFim = "${projeto.dataPrevisaoFim}";
            dataFormatada = formatarData(dataPrevisaoFim);
            console.log(dataFormatada)
            document.getElementById("dataPrevisaoFim").textContent = dataFormatada;


        </script>