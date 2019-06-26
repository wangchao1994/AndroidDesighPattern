package com.example.android.decorative;

public class UserB extends Master {
    public UserB(Swordsman swordsman) {
        super(swordsman);
    }

    @Override
    public void attackMagic() {
        super.attackMagic();
        teachAttackMagic();
    }

    public void teachAttackMagic(){
        System.out.println("B----->A_ONE");
        System.out.println("B----->A_TWO");
    }
}
