/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author pretto
 */
public class Item {

    private int id;
    private String descricao;
    private int apresentacao_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getApresentacao_id() {
        return apresentacao_id;
    }

    public void setApresentacao_id(int apresentacao_id) {
        this.apresentacao_id = apresentacao_id;
    }

}
