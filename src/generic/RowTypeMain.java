package generic;

public class RowTypeMain {

    public static void main(String[] args) {
        GenricBox integerBox = new GenricBox();
//        GenricBox<Object> integerBox = new GenricBox(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
