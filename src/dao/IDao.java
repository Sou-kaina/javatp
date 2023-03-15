package dao;

import model.Etu;

public interface IDao<T,ID> {

        Etu trouverParID(ID id);

}
