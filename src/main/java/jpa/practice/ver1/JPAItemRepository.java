package jpa.practice.ver1;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;

@Primary
public interface JPAItemRepository extends JpaRepository<Item, Long> {

}
