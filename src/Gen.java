public class Gen<T extends Number> implements Printable{
    private T number1;
    private T number2;

    public Gen(T n1, T n2) {
        number1 = n1;
        number2 = n2;
    }

    public T getNumber1() {
        return number1;
    }

    public T getNumber2() {
        return number2;
    }

    @Override
    public void addPaint(Object o) {

    }

    @Override
    public Object printPaint() {
        return null;
    }
}
