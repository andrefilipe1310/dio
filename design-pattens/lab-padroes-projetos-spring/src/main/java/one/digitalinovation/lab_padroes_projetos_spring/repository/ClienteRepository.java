package one.digitalinovation.lab_padroes_projetos_spring.repository;

import one.digitalinovation.lab_padroes_projetos_spring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Long> {
}
