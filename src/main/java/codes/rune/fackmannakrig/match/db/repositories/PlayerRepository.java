package codes.rune.fackmannakrig.match.db.repositories;

import codes.rune.fackmannakrig.match.db.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    // No need to implement basic methods, many already done.
}
