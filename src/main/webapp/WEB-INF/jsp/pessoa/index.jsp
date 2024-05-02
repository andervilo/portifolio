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
                    <h3>Lista de Pessoas</h3>
                </div>
            </div>

        </div>

        <div class="panel-body">
            <table class="table table-striped table-sm">
                <thead>
                <tr>
                    <th width="10%">#ID</th>
                    <th width="20%">Nome</th>
                    <th width="15%">Cargo</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${pessoas}" var="pessoa">
                    <tr>
                        <td>${pessoa.id}</td>
                        <td>${pessoa.nome}</td>
                        <td>
                            <c:if test="${pessoa.gerente}">
                                Gerente
                            </c:if>
                            <c:if test="${!pessoa.gerente and pessoa.funcionario}">
                                Funcionário
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>

<%@ include file="../common/footer.jspf"%>

