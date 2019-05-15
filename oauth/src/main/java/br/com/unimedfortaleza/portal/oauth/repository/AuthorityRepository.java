package br.com.unimedfortaleza.portal.oauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unimedfortaleza.portal.oauth.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

    Authority findByName(String name);
}