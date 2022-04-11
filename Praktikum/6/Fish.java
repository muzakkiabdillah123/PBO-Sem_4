public class Fish {
    String name;
    String typeOfFish;
    int friendliness;

    Fish() {
        name = "";
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    Fish(String n, String tof, int f) {
        name = n;
        typeOfFish = tof;
        friendliness = f;
    }

    void setName(String n) {
        name = n;
    }

    void setTypeOfFish(String tof) {
        typeOfFish = tof;
    }

    void setFriendliness(int f) {
        friendliness = f;
    }

    String getName() {
        return name;
    }

    String getTypeOfFish() {
        return typeOfFish;
    }

    int getFriendliness() {
        return friendliness;
    }

    Fish nicestFish(Fish f1, Fish f2) {
        if (f1.friendliness > f2.friendliness) {
            return f1;
        } else {
            return f2;
        }
    }
}
