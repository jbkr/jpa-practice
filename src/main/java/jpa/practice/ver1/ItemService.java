package jpa.practice.ver1;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ItemService {

	private final JPAItemRepository jpaItemRepository;

	public ItemService(JPAItemRepository jpaItemRepository) {
		this.jpaItemRepository = jpaItemRepository;
	}

	public Item save(Item item) {
		return jpaItemRepository.save(item);
	}
	
	public List<Item> findAll(){
		return jpaItemRepository.findAll();
	}
	
	public Optional<Item> findById(Long id) {
		return jpaItemRepository.findById(id);
	}
	
}
