<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="../common/header-start.jspf"%>
<link href="<c:url value="../../../static/projeto/create.css"/>" rel="stylesheet">
<%@ include file="../common/header-end.jspf"%>
<%@ include file="../common/navbar.jspf"%>
<div class="container cstmt-5">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading"><h3>Nova Pessoa</h3></div>
                <div class="panel-body">
                    <form  id="criar-projeto" method="post" modelAttribute="projeto">
                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="nome" class="form-label">Nome</label>
                                <input type="text" class="form-control" id="nome" name="nome" required>
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="dataNascimento" class="form-label">Data de Nascimento</label>
                                <input type="date" class="form-control" id="dataNascimento" name="dataNascimento">
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3">
                                <label for="cpf" class="form-label">CPF</label>
                                <input type="text" class="form-control" id="cpf" name="cpf">
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3 form-check">
                                <input type="checkbox" class="form-check-input" id="funcionario" name="funcionario">
                                <label class="form-check-label" for="funcionario">Funcionário</label>
                            </div>
                        </fieldset>

                        <fieldset class="form-group">
                            <div class="mb-3 form-check">
                                <input type="checkbox" class="form-check-input" id="gerente" name="gerente">
                                <label class="form-check-label" for="gerente">Gerente</label>
                            </div>
                        </fieldset>


                        <button type="submit"  class="btn btn-success" >Salvar</button>
                    </form>
                </div>
            </div>

</div>
<%@ include file="../common/footer.jspf"%>
