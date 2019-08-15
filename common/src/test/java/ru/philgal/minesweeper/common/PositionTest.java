// package ru.philgal.minesweeper.common;

// import org.assertj.core.api.Assertions;
// import org.junit.jupiter.api.Test;

// class PositionTest {

//     private final int fieldLength = 9;

//     @Test
//     void shouldCalculateAdjacentPositions_zero() {
//         Position position = new Position(0, 0, fieldLength);
//         Position[] aps = position.adjacentPositions();

//         Assertions.assertThat(aps).containsExactlyInAnyOrder(new Position(1, 0, fieldLength), new Position(0, 1, fieldLength),
//                 new Position(1, 1, fieldLength));
//     }

//     @Test
//     void shouldCalculateAdjacentPositions_zero_five() {
//         Position position = new Position(5, 0, fieldLength);
//         Position[] aps = position.adjacentPositions();

//         Assertions.assertThat(aps).containsExactlyInAnyOrder(new Position(4, 0, fieldLength),
//                 new Position(4, 1, fieldLength), new Position(5, 1, fieldLength), new Position(6, 0, fieldLength),
//                 new Position(6, 1, fieldLength));
//     }

//     @Test
//     void shouldCalculateAdjacentPositions_five_five() {
//         Position position = new Position(5, 5, fieldLength);
//         Position[] aps = position.adjacentPositions();

//         Assertions.assertThat(aps).containsExactlyInAnyOrder(new Position(4, 4, fieldLength),
//                 new Position(4, 5, fieldLength), new Position(4, 6, fieldLength), new Position(5, 4, fieldLength),
//                 new Position(5, 6, fieldLength), new Position(6, 4, fieldLength), new Position(6, 5, fieldLength),
//                 new Position(6, 6, fieldLength));
//     }

//     @Test
//     void shouldCalculateAdjacentPositions_fieldLength() {
//         Position position = new Position(fieldLength, 0, fieldLength);
//         Position[] aps = position.adjacentPositions();

//         Assertions.assertThat(aps).containsExactlyInAnyOrder(new Position(4, 0, fieldLength),
//                 new Position(4, 1, fieldLength), new Position(5, 1, fieldLength), new Position(6, 0, fieldLength),
//                 new Position(6, 1, fieldLength));
//     }
// }