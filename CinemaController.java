package cinema;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CinemaController {
    private final CinemaService cinemaService;

    public CinemaController() {
        this.cinemaService = new CinemaService();
    }

    @GetMapping("/seats")
    public Map<String, Object> getSeats() {
        List<Seat> seats = cinemaService.getAvailableSeats();

        Map<String, Object> response = new HashMap<>();
        response.put("rows", cinemaService.getTotalRows());
        response.put("columns", cinemaService.getTotalColumns());
        response.put("seats", seats);

        return response;
    }
}
