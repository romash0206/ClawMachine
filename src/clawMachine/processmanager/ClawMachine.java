package clawMachine.processmanager;


import clawMachine.entity.CoinAcceptor;
import clawMachine.service.IOService;

public class ClawMachine {
    private IOService ioService;
    int totalToys;

    private CoinAcceptor coinAcceptor;


    private ClawMachine(IOService ioService) {
        this.ioService = ioService;
    }

    private ClawMachine(int totalToys) {
        this.totalToys = totalToys;
    }

    public ClawMachine(CoinAcceptor coinAcceptor) {
        this.coinAcceptor = coinAcceptor;
    }

    public void run() {
        // во внешнем цикле
        //     приветствие
        //     считаль значение и передать в coinacceptor
        //     если корректная монета
        //         внутренний цикл
        //             строчка с кол-вом попыток и предложение сыграть
        //             дернуть руку и записат результат
        //             уменьшить кол-во игрушек если нужно и выдать сообщение когда мин
        // запустить новый внешний цикл
        while (totalToys > 2) {


            ioService.write("Вбросьте монету номиналами 50коп, 1руб или 2 руб");
            String attempt = ioService.read();


//    private void chooseOperation() {
//        int operation = ioService.read();
//        switch (operation) {
//            case 0:
//                break;
//            case 1:
//                createCoffee();
//                break;
//            case 2:
//                createCapuchino();
//                break;
//            case 3:
//                createHotMilk();
//                break;
//            default:
//                ioService.write("Неизвестная операция");
//                run();
//        }
        }
    }

}
