package poly.ex6.sender;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String str) {
        System.out.println("페이스북에 발송합니다 : " + str);
    }
}
