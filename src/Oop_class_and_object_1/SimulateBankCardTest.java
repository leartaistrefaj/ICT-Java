package Oop_class_and_object_1;

public class SimulateBankCardTest {
    public static void main(String[] args) {
        SimulateBankCard sbc1 = new SimulateBankCard();
        sbc1.setBankName("BPB");
        sbc1.setCardType("Visa");
        sbc1.setPIN(1458);

        SimulateBankCard sbc2 = new SimulateBankCard();
        sbc2.setBankName("Teb");
        sbc2.setCardType("Visa");
        sbc2.setHolderNumber(1584777);

        SimulateBankCard sbc3 = new SimulateBankCard();
        sbc3.setBankName("Procredit Bank");
        sbc3.setCardType("Visa");
        sbc3.deposit(520);
        sbc3.withdraw(260);

        SimulateBankCard sbc4 = new SimulateBankCard();
        sbc4.setBankName("Banka ekonomike");
        sbc4.setCardType("Visa");
        sbc4.deposit(520);
        sbc4.withdraw(200);

        System.out.println("Klienti me numer te llogarise " + sbc1.getAccountNumber() + " nga banka " + sbc1.getBankName() + " ka llojin e  karteles " + sbc1.getCardType() );

    }
}
