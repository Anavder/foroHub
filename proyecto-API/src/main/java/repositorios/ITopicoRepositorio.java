package repositorios;

import modelos.topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicoRepositorio extends JpaRepository<topicos, Integer> {
}
