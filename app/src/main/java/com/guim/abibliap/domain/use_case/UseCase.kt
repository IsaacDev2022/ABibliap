package com.guim.abibliap.domain.use_case

data class UseCase(
    val findAllBooksUseCase: FindAllBooksUseCase,
    val findOneBookUseCase: FindOneBookUseCase,
    val findChapterUseCase: FindChapterUseCase
)
