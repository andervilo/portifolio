<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="../common/header-start.jspf"%>
<link href="<c:url value="../../../static/projeto/create.css"/>" rel="stylesheet">
<%@ include file="../common/header-end.jspf"%>
<%@ include file="../common/navbar.jspf"%>
<div class="container cstmt-5">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading"><h3>Atualizar Projeto</h3></div>
                <div class="panel-body">
                    <form method="post" modelAttribute="projeto">
                        <input type="hidden" name="id" value="${projetoExistente.id}">
                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="nome">Nome do Projeto</label>
                                <input name="nome" type="text" class="form-control" required="required" value="${projetoExistente.nome}"/>
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="descricao">Descrição</label>
                                <textarea name="descricao" type="text" class="form-control" required="required">${projetoExistente.descricao}</textarea>
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="gerente">Gerente</label>
                                <select name="gerente.id" class="form-select" aria-label="Default select example" >
                                    <option selected>Selecione um Gerente</option>
                                    <c:forEach var="gerente" items="${gerentes}">
                                        <option ${gerente.id == projetoExistente.gerente.id ? 'selected' : ''} value="${gerente.id}">${gerente.getNome()}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="dataInicio">Data Início</label>
                                <input type="date" name="dataInicio" class="form-control" id="dataInicio"  value="${projetoExistente.dataInicio}">
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="dataPrevisaoFim">Previsão dataFinalização</label>
                                <input type="date" name="dataPrevisaoFim" class="form-control" id="dataPrevisaoFim" value="${projetoExistente.dataPrevisaoFim}" >
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="dataFim">Data Fim</label>
                                <input type="date" name="dataFim" class="form-control" id="dataFim" value="${projetoExistente.dataFim}" >
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="orcamento">Orçamento</label>
                                <input name="orcamento" type="text" class="form-control" required="required" value="${projetoExistente.orcamento}"/>
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="status">Status</label>
                                <select name="status" class="form-select" aria-label="Default select example">
                                    <option selected>Selecione um Status</option>
                                    <c:forEach var="status" items="${statusList}">
                                        <option ${status == projetoExistente.status ? 'selected' : ''} value="${status.name()}">${status.displayValue()}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="risco">Risco</label>
                                <select name="risco" class="form-select" aria-label="Default select example">
                                    <option selected>Selecione um Risco</option>
                                    <c:forEach var="risco" items="${riscoList}">
                                        <option ${risco == projetoExistente.risco ? 'selected' : ''} value="${risco.name()}">${risco.displayValue()}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </fieldset>

                        <button type="submit" class="btn btn-success">Salvar</button>
                    </form>
                </div>
            </div>

</div>
<%@ include file="../common/footer.jspf"%>

