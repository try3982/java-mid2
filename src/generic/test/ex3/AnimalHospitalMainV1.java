package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;
import generic.ex2.AnimalMain1;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 300);


        // 문제 1 개 병원에 고양이 전달
        dogHospital.set(cat);   // 매개변수에서 체크 실패 ㅣ 컴파일 오류가 발생하지 않음

        // 문제 2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog  = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = "+biggerDog);
    }
}
