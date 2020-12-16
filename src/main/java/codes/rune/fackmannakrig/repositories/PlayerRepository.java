package codes.rune.fackmannakrig.repositories;

import codes.rune.fackmannakrig.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    // No need to implement basic methods, many already done.
}
