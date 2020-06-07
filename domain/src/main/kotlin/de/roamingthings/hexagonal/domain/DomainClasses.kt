@file:Suppress("EXPERIMENTAL_FEATURE_WARNING")

package de.roamingthings.hexagonal.domain

import java.time.Instant

data class Journal(val id: JournalId, val created: Instant, val name: String, val notes: List<Note>)

data class Note(val id: NoteId, val created: Instant, val blocks: List<Block>)

data class Block(val id: BlockId, val created: Instant, val content: String)

inline class JournalId(val id: String)
inline class NoteId(val id: String)
inline class BlockId(val id: String)
