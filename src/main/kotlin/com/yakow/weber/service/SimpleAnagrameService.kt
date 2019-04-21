package com.yakow.weber.service

import org.springframework.stereotype.Service

/**
 * @author YWeber
 * project ShellDemo
 * Created on 19.04.19
 */

@Service
class SimpleAnagramService : AnagramService {
    lateinit var candidateAnagram: String
    lateinit var checkAnagram: String

    override fun searchAnagram(firstWord: String, secondWord: String): String {
        val markerFindAnagram = markerFindAnagram(firstWord, secondWord)
        val answer = if (markerFindAnagram) "Да" else "Нет"
        return "Слова $firstWord и $secondWord явлюються анаграммой = $answer"
    }

    override fun getResultAnagram(): String {
        return "checkAnagram =   $checkAnagram candidateAnagram = $candidateAnagram"
    }

    private fun markerFindAnagram(firstWord: String, secondWord: String): Boolean {
        if (firstWord.length != secondWord.length) return false
        val firstLiterals = firstWord.toMutableList()
        val secondLiterals = secondWord.toMutableList()
        val resultList = ArrayList<Char>(secondLiterals)
        firstLiterals.forEach { first ->
            overlapChar(secondLiterals, first, resultList)
        }
        return resultList.isEmpty()
    }

    private fun overlapChar(secondLiterals: MutableList<Char>, first: Char, resultList: ArrayList<Char>) {
        var foundChar = ' '
        var found = false
        secondLiterals.forEachIndexed { _, second ->
            if (first == second) {
                found = true
                foundChar = second
                return@forEachIndexed
            }
        }
        if (found) {
            resultList.remove(foundChar)
        }
    }

}