package LABA1;

public class Animal {


    protected int tell;
    String name;

    protected int runMaxDistance;

    public Animal(String name) {
        this.name = name;
        this.runMaxDistance = runMaxDistance;

    }
    public void run (int distance){
        System.out.println(name + "\tran\t" + distance);
    }
    public void swim (int distance2){
        System.out.println(name + "\tswam\t" + distance2);
    }
}

//        3.У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м; плавание:
//        кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет печать в
//        консоль. Например: dogBobik.run(150); -> 'Бобик пробежал 150 м' .
//        4. Создать один массив с животными и заставляете их по очереди пробежать дистанцию и
//        проплыть.
//        5. * Добавить подсчет созданных Домашних Котов , Тигров , Собак , Животных...
//        КУК