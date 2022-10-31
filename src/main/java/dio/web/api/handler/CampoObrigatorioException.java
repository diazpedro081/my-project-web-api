package dio.web.api.handler;


public class CampoObrigatorioException extends BusinessException {

    public CampoObrigatorioException(String campo) {
        super(String.format("O campo %s é obrigatorio", campo));
    }

    public CampoObrigatorioException(String mensagem, Object... params) {
        super(mensagem, params);
    }
        
}
