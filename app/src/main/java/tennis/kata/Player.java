package tennis.kata;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Player {
    private String name;
    private Integer ptr;

    public void incrementPtr() {
        ptr++;
    }

    public void decrementPtr() {
        ptr--;
    }

    public Integer getPtr() {
        return ptr;
    }
}
