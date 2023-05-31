package virado.no.jiray.javacore.DayStrategy;

public class Context {

    public <T> boolean validates(T valor, IValidator<T> strategy){
        return  strategy.validar(valor);
    }
}
