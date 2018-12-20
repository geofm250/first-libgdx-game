package za.co.geoffrey.sprites;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PlayerAtlasRegion {
    BACK_BOTH("back-both"),
    FORWARD_BOTH("forward-both"),
    LEFT_BOTH("left-both"),
    RIGHT_BOTH("right-both"),
    FORWARD_LEFT("forward-left"),
    FORWARD_RIGHT("forward-right"),
    LEFT_RIGHT("left-right"),
    RIGHT_LEFT("right-left"),
    BACK_RIGHT("back-right"),
    BOTH_LEFT("both-left"),
    LEFT_LEFT("left-left"),
    RIGHT_RIGHT("right-right");

    @Getter
    private String name;

    public static PlayerAtlasRegion getEnum(String name) {
        for(PlayerAtlasRegion v : values())
            if(v.getName().equalsIgnoreCase(name)) return v;
        throw new IllegalArgumentException();
    }

}
