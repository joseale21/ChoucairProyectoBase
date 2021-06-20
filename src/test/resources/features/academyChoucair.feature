# Autor: Jose Santamaria
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate is screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than dante wants to learn automation at the academy choucair
      | strUser   | strPassword   |
      | <strUser> | <strPassword> |
    When he search for the course on the choucair academy plataform
      | strCourse   |
      | <strCourse> |
    Then he finds the course called
      | strCourse   |
      | <strCourse> |