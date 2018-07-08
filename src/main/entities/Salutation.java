package main.entities;

public enum Salutation {
    Mr,
    Miss,
    Mrs;

    @Override
    public String toString() {
        switch(this)
        {
            case Mrs: return "Mrs";
            case Miss: return "Miss";
            default: return "Mr";

        }
    }
}
