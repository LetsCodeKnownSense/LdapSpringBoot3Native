package com.knownsense.springldaps;

import com.knownsense.springldaps.dto.Person;
import com.knownsense.springldaps.repo.PersonRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * <code>AddressValidationController</code> is used to handle requests related to validation of address.
 *
 */
@RestController()
@RequestMapping(value="/knowsense")
public class LdapBindController {

	@Autowired
	private PersonRepo personRepo;

	@PostMapping("/add-user")
	public ResponseEntity<String> bindLdapPerson(@RequestBody Person person) {
		String result = personRepo.create(person);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	@PutMapping("/update-user")
	public ResponseEntity<String> rebindLdapPerson(@RequestBody Person person) {
		String result = personRepo.update(person);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	@GetMapping("/retrieve-users")
	public ResponseEntity<List<Person>> retrieve() {
		return new ResponseEntity<List<Person>>(personRepo.retrieve(), HttpStatus.OK);
	}
	@GetMapping("/remove-user")
	public ResponseEntity<String> unbindLdapPerson(@RequestParam(name = "userId") String userId) {
		String result = personRepo.remove(userId);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}

