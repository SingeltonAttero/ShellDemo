package com.yakow.weber.service

import org.junit.Assert
import org.junit.Test

class AnagramServiceTest {

    var anagramService: AnagramService = SimpleAnagramService()

    @Test
    fun correctAnagramSearch() {
        Assert.assertEquals(anagramService.searchAnagram("anagram", "margana"), "Слова anagram и margana явлюються анаграммой = Да")
        Assert.assertEquals(anagramService.searchAnagram("anagram", "anagram"), "Слова anagram и anagram явлюються анаграммой = Да")
    }

}

