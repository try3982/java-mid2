package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain1 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이",300);


        // 문제 1 개 병원에 고양이 전달
//        dogHospital.set(cat);  //  다른 타입 입력 : 컴파일 오류

        // 문제 2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2",200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
