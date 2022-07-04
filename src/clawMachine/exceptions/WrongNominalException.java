package clawMachine.exceptions;

public class WrongNominalException extends Exception{
    public WrongNominalException() {
        super("Неверный номинал монеты. Автомат принимает 50коп, 1руб и 2руб. Заберите монету и попробуйте еще раз");
    }
}
