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
        // �� ������� �����
        //     �����������
        //     ������� �������� � �������� � coinacceptor
        //     ���� ���������� ������
        //         ���������� ����
        //             ������� � ���-��� ������� � ����������� �������
        //             ������� ���� � ������� ���������
        //             ��������� ���-�� ������� ���� ����� � ������ ��������� ����� ���
        // ��������� ����� ������� ����
        while (totalToys > 2) {


            ioService.write("�������� ������ ���������� 50���, 1��� ��� 2 ���");
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
//                ioService.write("����������� ��������");
//                run();
//        }
        }
    }

}
