package com.yakow.weber.service

/**
 * @author YWeber
 * project ShellDemo
 * Created on 19.04.19
 */
interface AnagramService {
    fun searchAnagram(firstWord: String, secondWord: String): String
    fun getResultAnagram(): String
}