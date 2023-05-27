package tennis.kata;

import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@Builder
public class Player {
    private String name;
    private int ptr;

    public Player(String name, int ptr) {
        this.name = name;
        this.ptr = ptr;
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
