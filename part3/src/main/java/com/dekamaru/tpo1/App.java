package com.dekamaru.tpo1;


public class App {

    public static void main( String[] args ) throws Exception {
        Scream scream = new Scream();
        Noise noise = new Noise();
        Room room = new Room();

        scream.suddenlyShout();
        noise.suddenlyShout();

        Human firstMan = new Human(HumanType.ANGRY, Chest.FADED_BLUE, Belt.KRUKSWANA_UNIVERSITY);
        Human secondMan = new Human(HumanType.ANGRY, Chest.FADED_BLUE, Belt.KRUKSWANA_UNIVERSITY);
        Human firstFootman = new Human(HumanType.FOOTMAN, Chest.LIVERY, Belt.LIVERY);
        Human secondFootman = new Human(HumanType.FOOTMAN, Chest.LIVERY, Belt.LIVERY);

        firstMan.push(firstFootman);
        secondMan.push(secondFootman);

        room.getDoors().open();
        firstMan.go(room);
        secondMan.go(room);

        /*

        if (scream.isShout() && noise.isShout()) {
            Human firstMan = new Human(HumanType.ANGRY, Chest.FADED_BLUE, Belt.KRUKSWANA_UNIVERSITY);
            Human secondMan = new Human(HumanType.ANGRY, Chest.FADED_BLUE, Belt.KRUKSWANA_UNIVERSITY);

            Human firstFootman = new Human(HumanType.FOOTMAN, Chest.LIVERY, Belt.LIVERY);
            Human secondFootman = new Human(HumanType.FOOTMAN, Chest.LIVERY, Belt.LIVERY);


            if (
                    firstMan.getBelt() == Belt.KRUKSWANA_UNIVERSITY &&
                            firstMan.getChest() == Chest.FADED_BLUE         &&
                            secondMan.getBelt() == Belt.KRUKSWANA_UNIVERSITY &&
                            secondMan.getChest() == Chest.FADED_BLUE
                    )
            {
                firstMan.push(firstFootman);
                secondMan.push(secondFootman);

                if (firstFootman.isDown() && secondFootman.isDown()) {
                    room.getDoors().open();
                    if (room.getDoors().isOpen()) {
                        firstMan.go(room);
                        secondMan.go(room);
                        if (room.getHumansInRoom().size() != 2) {
                            throw new Exception("Angry humans not in room");
                        } else {
                            for(Human h : room.getHumansInRoom()) {
                                if (h.getType() != HumanType.ANGRY || h.getChest() != Chest.FADED_BLUE || h.getBelt() != Belt.KRUKSWANA_UNIVERSITY) {
                                    throw new Exception("Wrong human in room");
                                }
                            }
                            System.out.println("The end");
                        }

                    } else {
                        throw new Exception("Doors not opened");
                    }
                } else {
                    throw new Exception("Footmans not down by angry humans!");
                }
            } else {
                throw new Exception("Angry humans does not normally equipped");
            }
        } else {
            throw new Exception("Scream and noise doesnt shout");
        }*/
    }
}
