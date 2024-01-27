package jpa.practice.ver1;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ItemService {

	private final JPAItemRepository jpaItemRepository;

	public ItemService(JPAItemRepository jpaItemRepository) {
		this.jpaItemRepository = jpaItemRepository;
	}

	public Item addItem(Item item) {
		return jpaItemRepository.save(item);
	}
	
	public List<Item> list(){
		return jpaItemRepository.findAll();
	}
}
