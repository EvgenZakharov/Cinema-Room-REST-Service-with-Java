package cinema;

import java.util.ArrayList;
import java.util.List;

public class CinemaService {
    private static final int TOTAL_ROWS = 9;
    private static final int TOTAL_COLUMNS = 9;

    public List<Seat> getAvailableSeats() {
        List<Seat> seats = new ArrayList<>();
        for (int row = 1; row <= TOTAL_ROWS; row++) {
            for (int column = 1; column <= TOTAL_COLUMNS; column++) {
                seats.add(new Seat(row, column));
            }
        }
        return seats;
    }

    public int getTotalRows() {
        return TOTAL_ROWS;
    }

    public int getTotalColumns() {
        return TOTAL_COLUMNS;
    }
}
