package com.fmi.learnspanish.domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "VOCABULARY_LEVEL")
@Getter
@Setter
@NoArgsConstructor
public class VocabularyLevel {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(length = 36)
	private String id;

	@Column(name = "VOCABULARY_LEVEL")
	private int level;

	@ManyToOne(optional = false)
	@JoinColumn(name = "LESSON_ID", referencedColumnName = "ID")
	private Lesson lesson;

	@OneToMany(mappedBy = "vocabularyLevel")
	private Collection<User> user;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "vocabularyLevel")
	private Collection<VocabularyCategory> categories;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lesson == null) ? 0 : lesson.hashCode());
		result = prime * result + level;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		VocabularyLevel other = (VocabularyLevel) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}

		if (lesson == null) {
			if (other.lesson != null) {
				return false;
			}
		} else if (!lesson.equals(other.lesson)) {
			return false;
		}

		if (level != other.level) {
			return false;
		}

		return true;
	}

}
