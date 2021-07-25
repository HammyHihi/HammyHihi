package com.tutorial;
//super class
class Member{
    String name;
    double attackPower, health;

    Member(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    void attack(Member enemy){
        System.out.println("\n" + this.name + " is attacking " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double damage){
        System.out.println(this.name + " receiving damage" + ": " + damage);
        this.health = health - damage;
    }

    void display(){
        System.out.println("\nMember name : " + this.name);
        System.out.println("Health      : " + this.health);
        System.out.println("Power       : " + this.attackPower);

    }

    
}

//subclass
class MemberStrength extends Member{
    String type = "Strength";

    MemberStrength(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type        : " + this.type);
    }

    @Override
    void takeDamage(double damage){
        System.out.println(this.name + " receiving half damage" + ": " + 0.5*damage);
        this.health = health - 0.5*damage;
    }
}

class MemberIntel extends Member{
    String type = "Attack";

    MemberIntel(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type        : " + this.type);
    }

    @Override
    void takeDamage(double damage){
        System.out.println(this.name + " receiving damage penetration" + ": " + 2.0*damage);
        this.health = health - 2.0*damage;
    }
   

}

public class WarGameConcept {
    public static void main(String[] args) {
        Member member1 = new Member("Ucup", 10, 100);
        MemberStrength member2 = new MemberStrength("Otong", 10, 200);
        MemberIntel member3 = new MemberIntel("Muto", 20, 100);
        member1.display();
        member2.display();
        member3.display();

        System.out.println("\n PERTARUNGAN DIMULAI!!!");
        member1.attack(member3);

        member3.display();

        


        
    }
}
