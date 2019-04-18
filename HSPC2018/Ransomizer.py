def ransomizer(ransom, magazine):
    for i in ransom:
        if i.islower():
            if magazine.find(i)==-1:
                return False
            else:
                magazine = magazine.replace(i," ", 1)
    return True