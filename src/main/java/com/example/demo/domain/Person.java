package com.example.demo.domain;

import java.util.List;

public record Person(String name,
                     String career,
                     List<String> suggestionList) {
}
