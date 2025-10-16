package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenricBox<Integer> integerBox = new GenricBox<Integer>(); // 생성시점에 T의 타입이 결정
        integerBox.set(10);
//        integerBox.set("문자 100"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // Integer타입 반환(캐스팅 X)


        GenricBox<String> stringBox = new GenricBox<String>();
        stringBox.set("Hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능
        GenricBox<Double> doubleBox = new GenricBox<>();
        doubleBox.set(3.14);
        Double double1 = doubleBox.get();
        System.out.println("double1 = " + double1);

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        GenricBox<Integer> integerGenricBox2 = new GenricBox<>();
        integerGenricBox2.set(integer);
        Integer integer2 = integerGenricBox2.get();
        System.out.println("integer2 = " + integer2);

    }
}
