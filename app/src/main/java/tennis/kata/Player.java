package tennis.kata;

import lombok.*;


@NoArgsConstructor
@Getter
@Setter

public class Player {
    private String name;
    private int ptr;

    public Player(String name) {
        this.name = name;
        this.ptr = 0;
    }

    public void incrementScore() {

        ptr++;
    }

    public void decrementScore() {
        ptr--;
    }

    public Integer getPtr() {

        return ptr;
    }
}
