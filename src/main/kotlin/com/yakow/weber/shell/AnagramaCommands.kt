package com.yakow.weber.shell

import com.yakow.weber.service.AnagramService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod
import org.springframework.shell.standard.ShellOption

/**
 * @author YWeber
 * project ShellDemo
 * Created on 19.04.19
 */
@ShellComponent
class AnagramaCommands @Autowired constructor(private val anagramsService: AnagramService) {

    @ShellMethod("anagram", key = ["anagram","check"])
    fun checkAnagram(@ShellOption candidateWord:String,@ShellOption checkCandidateWord:String): String {

       return  anagramsService.searchAnagram(candidateWord,checkCandidateWord)
    }

}