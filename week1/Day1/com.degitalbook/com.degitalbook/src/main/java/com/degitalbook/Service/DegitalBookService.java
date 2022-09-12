package com.degitalbook.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.degitalbook.Repository.DegitalbookRepository;
import com.degitalbook.entity.DegitalBookEntity;

@Service
public class DegitalBookService {

	@Autowired
	private DegitalbookRepository repository;

	public DegitalBookEntity saveDegitalbook(@RequestBody DegitalBookEntity bookEntity) {
		DegitalBookEntity save = repository.save(bookEntity);
		return save;
	}

	public DegitalBookEntity updateDegitalbook(@PathVariable long id, @RequestBody DegitalBookEntity bookEntity) {
		DegitalBookEntity getbookbyID = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("degital book not found" + id));
		getbookbyID.setId(bookEntity.getId());
		getbookbyID.setCategory(bookEntity.getCategory());
		getbookbyID.setTitle(bookEntity.getTitle());
		getbookbyID.setContent(bookEntity.getContent());
		getbookbyID.setImage(bookEntity.getImage());
		getbookbyID.setPrice(bookEntity.getPrice());
		getbookbyID.setPublisher(bookEntity.getPublisher());
		DegitalBookEntity save = repository.save(getbookbyID);
		return save;
	}

	public DegitalBookEntity getDegitalbookById(long id) {
		DegitalBookEntity getbookbyID = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("degital book not found" + id));
		return getbookbyID;
	}

	public List<DegitalBookEntity> getAllDegitalbook() {
		List<DegitalBookEntity> getbookbyID = repository.findAll();
		return getbookbyID;
	}

	public DegitalBookEntity deleteDegitalbookbyId(@PathVariable long id) {
		DegitalBookEntity getbookbyID = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("degital book not found" + id));
		if (getbookbyID != null)
			repository.deleteById(id);
		DegitalBookEntity save = repository.save(getbookbyID);
		return save;
	}

}
