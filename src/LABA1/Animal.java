package LABA1;

public class Animal {

    protected int tell;

    protected int maxRun;
    protected int maxSwim;
    String name;



    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;

        this.maxRun = maxRun;

        this.maxSwim = maxSwim;

    }
    public void run(int distance){
        if(maxRun >= distance) {
            this.maxRun = maxRun;
            System.out.println(name + " пробежал " + distance);
        }
        else{
            System.out.println(name + " не пробежал ");
        }

    }

    public void swim (int distance2){
        if(maxSwim >= distance2){
            this.maxSwim  = maxSwim;
            System.out.println(name + "  проплыл " + distance2);
        }
        else
            System.out.println(name + " не проплыл ");

    }
}

//        3.У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м; плавание:
//        кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет печать в
//        консоль. Например: dogBobik.run(150); -> 'Бобик пробежал 150 м' .
//        4. Создать один массив с животными и заставляете их по очереди пробежать дистанцию и
//        проплыть.
//        5. * Добавить подсчет созданных Домашних Котов , Тигров , Собак , Животных...
