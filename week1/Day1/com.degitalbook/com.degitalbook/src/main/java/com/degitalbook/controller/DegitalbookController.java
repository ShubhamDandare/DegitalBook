package com.degitalbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.degitalbook.Service.DegitalBookService;
import com.degitalbook.entity.DegitalBookEntity;

@RestController
@RequestMapping("/degitalbook")
public class DegitalbookController {

	@Autowired
	private DegitalBookService service;

	@GetMapping("/{id}")
	public DegitalBookEntity getbookByid(@PathVariable long id) {
		DegitalBookEntity degitalbookById = service.getDegitalbookById(id);
		return degitalbookById;
	}

	@PostMapping("/")
	public DegitalBookEntity createBookEntity(@RequestBody DegitalBookEntity entity) {
		DegitalBookEntity saveDegitalbook = service.saveDegitalbook(entity);
		return saveDegitalbook;
	}

	@PutMapping("/{id}")
	public DegitalBookEntity updateBookEntity(@PathVariable long id, @RequestBody DegitalBookEntity entity) {
		DegitalBookEntity saveDegitalbook = service.updateDegitalbook(id, entity);
		return saveDegitalbook;

	}
	
	@GetMapping("/")
	public List<DegitalBookEntity> getAllBookEntity() {
		List<DegitalBookEntity> saveDegitalbook = service.getAllDegitalbook();
		return saveDegitalbook;
	}

	@DeleteMapping("/{id}")
	public DegitalBookEntity deletebookByid(@PathVariable long id) {
		DegitalBookEntity degitalbookById = service.deleteDegitalbookbyId(id);
		return degitalbookById;
	}
}
