package aula20200924.revisão;

public class Disciplina {

	private String nome;
    private Professor professor;

    public Disciplina(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof Disciplina)) {
            return false;
        }
        Disciplina auxOther = (Disciplina) other;
        if (this.nome.equals(auxOther.nome)) {
            return true;
        }
        return false;
    }

	public Professor getProfessor() {
		return this.professor;
    }
    public void setProfessor(Professor professor) {
        if (professor.equals(this.professor)) {
            return;
        }
        this.professor = professor;
        this.professor.addDisciplinaMinistrada(this);
    }

}
